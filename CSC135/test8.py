class Count:
    def __init__(self, counter, limit):
        self.counter = counter
        self.limit = limit
    def increment(self):
        if self.counter < self.limit:
            self.counter += 1
            print(self.counter)
        else:
            print(self.limit)
    def decrement(self):
        if self.counter > 0:
            self.counter -= 1
            print(self.counter)
        else:
            print(self.limit)
    def get_val(self):
        return self.counter
class Rectangle:
    def __init__(self, length, width):
        self.length = length
        self.width = width
    def getArea(self):
        area = self.length * self.width
        return area
    def getPerimeter(self):
        perimeter = 2 * (self.length + self.width)
        return perimeter
class Wages:
    def __init__(self, name, hours, wage):
        self.name = name
        self.hours = hours
        self.wage = wage
    def payForWeek(self):
        if self.hours > 40:
            amount = (40 * self.wage) + ((self.hours - 40) * (1.5 * self.wage))
        else:
            amount = self.hours * self.wage
        return amount
def f0():
    r0 = Count(10, 4)
    r0.increment()
    r0.decrement()
    value = r0.get_val()
    print(value)
def f1():
    r1 = Rectangle(4, 40)
    area = r1.getArea()
    perimeter = r1.getPerimeter()
    print(f"\nThe width of the rectangle is {4}.")
    print(f"The length of the rectangle is {40}.")
    print(f"The area of the rectangle is {area}.")
    print(f"The perimeter of the rectangle is {perimeter}.")
    r2 = Rectangle(3.5, 35.7)
    area = r2.getArea()
    perimeter = r2.getPerimeter()
    print(f"The width of the rectangle is {3.5}.")
    print(f"The length of the rectangle is {35.7}.")
    print(f"The area of the rectangle is {area}.")
    print(f"The perimeter of the rectangle is {perimeter}.")
def f3():
    name = input("\nEnter person's name: ")
    hours = float(input("Enter number of hours worked: "))
    wage = float(input("Enter hourly wage: "))
    salary = Wages(name, hours, wage)
    print(f"Pay for {name}: {salary.payForWeek()}")
f0()
f1()
f3()
