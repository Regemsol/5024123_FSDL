"""Validation helpers: email, phone, positive integer.
Small, dependency-free implementations for learning.
"""
import re


def is_email(s):
    if not isinstance(s, str):
        return False
    return re.match(r"^[\w\.-]+@[\w\.-]+\.\w+$", s) is not None


def is_phone(s):
    if not isinstance(s, str):
        return False
    # Accepts formats like 123-456-7890 or (123) 456 7890 or digits only
    return re.match(r"^\+?[0-9 ()-]{7,20}$", s) is not None


def is_positive_int(x):
    try:
        return int(x) > 0
    except (ValueError, TypeError):
        return False


def main():
    samples = ["alice@example.com", "bad@.com", "+1 800 555 0199", "12345"]
    for s in samples:
        print(s, 'email?', is_email(s), 'phone?', is_phone(s))
    for v in [10, '5', -2, 'x']:
        print(v, 'positive_int?', is_positive_int(v))


if __name__ == '__main__':
    main()
