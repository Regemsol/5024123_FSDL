"""Validation helpers: email, phone, positive integer.
Small, dependency-free implementations for learning.
"""
import re


def is_email(s):
    # Basic email pattern check (illustrative, not exhaustive)
    if not isinstance(s, str):
        return False
    return re.match(r"^[\w\.-]+@[\w\.-]+\.\w+$", s) is not None


def is_phone(s):
    # Permissive phone format check (allows digits, spaces, parens, hyphens)
    if not isinstance(s, str):
        return False
    return re.match(r"^\+?[0-9 ()-]{7,20}$", s) is not None


def is_positive_int(x):
    # Return True only for values that cast to a positive integer
    try:
        return int(x) > 0
    except (ValueError, TypeError):
        return False


def main():
    # Small demonstration of validation helpers
    samples = ["alice@example.com", "bad@.com", "+1 800 555 0199", "12345"]
    for s in samples:
        print(s, 'email?', is_email(s), 'phone?', is_phone(s))
    for v in [10, '5', -2, 'x']:
        print(v, 'positive_int?', is_positive_int(v))


if __name__ == '__main__':
    main()
