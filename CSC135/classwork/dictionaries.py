def function1():
    customer = {
        'Name': 'Kim',
        'cust_id': 1234,
        'phone': '732-123-4567',
        'order_num': 'abc123',

        'Name1': 'Stace',
        'cust_id1': 2234,
        'phone1': '732-223-4567',
        'order_num1': 'abc223'
        }
    for i in customer:
        print(f"{i} = {customer[i]}")
def function2():
    months = {
        '1': 'January',
        '2': 'February',
        '3': 'March',
        '4': 'April',
        '5': 'May',
        '6': 'June',
        '7': 'July',
        '8': 'August',
        '9': 'September',
        '10': 'October',
        '11': 'November',
        '12': 'December'
        }
    print()
    for i in months:
        print(f"{i} = {months[i]}")
def function3():
    cities = {
        'GA': 'Atlanta',
        'NY': 'Albany',
        'CA': 'San Diego'
        }
    print()
    for i in cities:
        print(f"{i} = {cities[i]}")
    cities['CA'] = 'Sacramento'
    print()
    for i in cities:
        print(f"{i} = {cities[i]}")
def main():
    function1()
    function2()
    function3()
if __name__ == "__main__":
    main()
