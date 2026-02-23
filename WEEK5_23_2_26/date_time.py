"""Date and time examples: parsing, formatting, arithmetic, validation."""
from datetime import datetime, timedelta


def parse_iso(s):
    try:
        return datetime.fromisoformat(s)
    except ValueError:
        return None


def add_days(dt, days):
    return dt + timedelta(days=days)


def format_dt(dt):
    return dt.strftime('%Y-%m-%d %H:%M:%S')


def main():
    now = datetime.now()
    print('now:', format_dt(now))
    later = add_days(now, 7)
    print('one week later:', format_dt(later))

    for s in ['2023-05-01T12:30:00', 'bad-date']:
        parsed = parse_iso(s)
        print(s, '->', parsed if parsed else 'invalid')


if __name__ == '__main__':
    main()
