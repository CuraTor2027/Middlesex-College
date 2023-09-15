class Person:
    stu_grade = 2
    def __init__(self, name_of_stu, age_of_stu):
        self.stu_name = name_of_stu
        self.stu_age = age_of_stu
lg = Person("Luca", 7)
print('stu_name is ', lg.stu_name)
print('stu_grade is ', lg.stu_grade)
print('stu_age is ', lg.stu_age)
print()

class Fruits:
    def __init__(self, fruitname, price, qty):
        self.price = price
        self.qty = qty
        self.fruitname = fruitname
    def computeTotal(self):
        total = self.price * self.qty
        print("Thanks for your purchase")
        print(f"Your {self.fruitname} total is = {total}")
myfruits = Fruits("orange", 0.5, 6)
myfruits.computeTotal()
print()

class Rectangle:
    def __init__(self, length, width):
        self.length = length
        self.width = width
    def perimeter(self):
        perimeter = (self.length * 2) + (self.width * 2)
        print(f"Perimeter: {perimeter}")
    def area(self):
        area = self.length * self.width
        print(f"Area: {area}")
ptr_to_rect = Rectangle(4, 5)
ptr_to_rect.perimeter()
ptr_to_rect.area()
print()

length = int(input("Enter a length for the rectangle: "))
width = int(input("Enter a width for the rectangle: "))
rect = Rectangle(length, width)
rect.perimeter()
rect.area()
print()

