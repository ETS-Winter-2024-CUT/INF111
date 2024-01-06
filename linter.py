# -*- coding: utf-8 -*-
"""
Ce script est conçu pour effectuer des contrôles spécifiques sur des fichiers \
    de code, tels que la longueur des lignes et les Javadocs.
"""
import glob
import os
import re
import sys

# Workflow settings
EXIT_STATUS_SUCCESS = 0
EXIT_STATUS_FAILURE = 1

# Default settings
DEFAULT_RULER = 100


def print_error(filename: str, line_num: int, message: str) -> None:
    print(f"<{filename}> \tLigne {line_num + 1:>3}: {message}")


def verify_final_new_line(filename: str, lines: list[str]) -> bool:
    if lines[-1].strip() == lines[-1]:
        print_error(filename, len(lines), "Il manque une ligne vide tout en bas du fichier.")
        return False

    return True


def verify_javadoc(filename: str, lines: list[str]):
    # Trouver l'index où les importations se terminent
    import_end_index = len(lines)

    for i, line in enumerate(lines):
        if not line.strip().startswith("import "):
            import_end_index = i
            break

    # Combiner les lignes après les importations pour rechercher du Javadoc
    rest_of_code = "\n".join(lines[import_end_index:])

    # Définir le motif regex qui correspond au Javadoc
    pattern = (r"/\*\*(?:.|\n)*?\*/")   # Correction du motif regex pour correspondre au Javadoc
    
    header_comment = re.search(pattern, rest_of_code, re.DOTALL)

    if header_comment:
        return True

    print_error(filename, i, f"Il manque un Javadoc dans ce fichier.")
    return False


def verify_ruler(filename: str, lines: list[str], ruler: int) -> bool:
    success_status = True

    for index, line in enumerate(lines):
        line_lenght = len(line.strip())

        if line_lenght > ruler:
            success_status = False
            print_error(filename, index, f"Ligne trop longue ({line_lenght} > {ruler}).")

    return success_status


def verify_useless_spaces(filename: str, lines: list[str]) -> bool:
    success_status = True

    for index, line in enumerate(lines):
        line = line.rstrip("\n")
        if line.rstrip() != line:
            print_error(filename, index, "Il y a des espaces inutiles en fin de ligne.")
            success_status = False

    return success_status


def main(files: list[list]) -> bool:
    exit_status = EXIT_STATUS_SUCCESS

    for filename in files:
        if not os.path.exists(filename):
            print(f"Fichier introuvable : {filename}")
            raise FileNotFoundError

        # Ouverture et traitement du fichier
        with open(filename, "r") as f:
            lines = f.readlines()

            if not verify_final_new_line(filename, lines) \
                or not verify_javadoc(filename, lines) \
                or not verify_ruler(filename, lines, DEFAULT_RULER) \
                or not verify_useless_spaces(filename, lines):
                exit_status = EXIT_STATUS_FAILURE

    return exit_status


if __name__ == "__main__":
    if len(sys.argv) != 2:
        script_name = os.path.splitext(os.path.basename(__file__))[0]
        print(f"Utilisation: python {script_name}.py file(s)")
        exit(EXIT_STATUS_FAILURE)

    file_patterns = sys.argv[1:]
    files = []

    for pattern in file_patterns:
        # Utilisation de glob pour trouver les fichiers correspondants au motif
        matching_files = glob.glob(pattern, recursive=True)
        files.extend(matching_files)

    if not files:
        print("Aucun fichier correspondant trouve.")
        exit(EXIT_STATUS_FAILURE)

    exit_status = main(files)
    exit(exit_status)
