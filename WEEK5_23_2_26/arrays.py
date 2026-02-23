"""Array (list) examples: creation, operations, and error handling."""


def dedupe(seq):
    # Preserve order while removing duplicates
    seen = set()
    out = []
    for x in seq:
        if x not in seen:
            seen.add(x)
            out.append(x)
    return out


def safe_get(seq, index, default=None):
    # Return element or a default instead of raising IndexError
    try:
        return seq[index]
    except IndexError:
        return default


def stats(nums):
    # Compute simple stats; raise on empty input to signal caller
    if not nums:
        raise ValueError('Empty list')
    return {'min': min(nums), 'max': max(nums), 'sum': sum(nums), 'count': len(nums)}


def main():
    # Demo showing dedupe, safe access, and error handling for stats
    a = [3, 1, 2, 3, 4, 1]
    print('original:', a)
    print('deduped:', dedupe(a))
    print('safe_get a[10]:', safe_get(a, 10, 'missing'))
    try:
        print('stats([]):', stats([]))
    except ValueError as e:
        print('stats error:', e)
    print('sorted:', sorted(a))


if __name__ == '__main__':
    main()
