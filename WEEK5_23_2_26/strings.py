"""String manipulation examples: slicing, formatting, and simple checks."""


def reverse(s):
    # Return the string reversed using slicing
    return s[::-1]


def is_palindrome(s):
    # Normalize and compare to check palindrome-ness
    if not isinstance(s, str):
        return False
    s2 = ''.join(ch.lower() for ch in s if ch.isalnum())
    return s2 == s2[::-1]


def truncate(s, length):
    # Truncate with ellipsis when string exceeds length
    return s if len(s) <= length else s[:length-3] + '...'


def main():
    # Demo of common string helpers
    s = 'Able was I, ere I saw Elba'
    print('reverse:', reverse('hello'))
    print('palindrome?', is_palindrome(s))
    print('truncate:', truncate('This is a long sentence.', 12))
    print('format:', 'Name: {name}, Age: {age}'.format(name='Sam', age=30))


if __name__ == '__main__':
    main()
