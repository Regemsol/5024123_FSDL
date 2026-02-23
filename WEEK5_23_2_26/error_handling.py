"""Simple error handling examples.
Keep functions small and demonstrative.
"""
# Return quotient or an explanatory error string when invalid.
def safe_divide(a, b):
    try:
        return a / b
    except ZeroDivisionError:
        return "Error: division by zero"
    except TypeError:
        return "Error: unsupported operand type"


# Convert value to int or raise a clear ValueError.
def read_int(value):
    try:
        return int(value)
    except ValueError:
        raise ValueError("Invalid integer: {}".format(value))


def main():
    # Demo calls showing normal and error cases
    print('safe_divide(10, 2) ->', safe_divide(10, 2))
    print('safe_divide(5, 0) ->', safe_divide(5, 0))
    print('safe_divide("a", 2) ->', safe_divide('a', 2))

    for val in ['3', 'x', 5.6]:
        try:
            print('read_int({}) ->'.format(val), read_int(val))
        except ValueError as e:
            print('read_int error:', e)


if __name__ == '__main__':
    main()
