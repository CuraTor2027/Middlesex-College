class Rectangle:
    perimeterst = 'Perimeter computation'
    areast = 'Area computation'

    def __init__(self, length, width):
        self.length = length
        self.width = width

    def perimeter(self):
        perimeter = (self.length * 2) + (self.width * 2)
        print(f"Perimeter: {perimeter}")
        
    def area(self):
        area = self.length * self.width
        print(f"Area: {area}")

ptr_to_rect = Rectangle(6, 7)
ptr_to_rect.perimeter()
ptr_to_rect.area()
