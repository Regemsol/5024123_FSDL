"""String manipulation examples: slicing, formatting, and simple checks."""


def reverse(s):
    return s[::-1]


def is_palindrome(s):
    if not isinstance(s, str):
        return False
    s2 = ''.join(ch.lower() for ch in s if ch.isalnum())
    return s2 == s2[::-1]


def truncate(s, length):
    return s if len(s) <= length else s[:length-3] + '...'


def main():
    s = 'Able was I, ere I saw Elba'
    print('reverse:', reverse('hello'))
    print('palindrome?', is_palindrome(s))
    print('truncate:', truncate('This is a long sentence.', 12))
    print('format:', 'Name: {name}, Age: {age}'.format(name='Sam', age=30))


if __name__ == '__main__':
    main()
