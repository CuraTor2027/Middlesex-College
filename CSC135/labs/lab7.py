class Compute():
    def __init__(self, x, y, z):
        self.a = x
        self.b = y
        self.c = z
    def sum(self):
        sum_vals = self.a + self.b + self.c
        print ('sum_vals ', sum_vals)
    def dif(self):
        dif_vals = self.a - self.b - self.c
        print ('dif_vals ', dif_vals)
    def mult(self):
        mult_vals = self.a * self.b * self.c
        print ('mult_vals ', mult_vals)
num1 = 2
num2 = 3
num3 = 4
compute_obj = Compute(num1, num2, num3)
compute_obj.sum()
compute_obj.dif()
compute_obj.mult()

class Rect:
    def __init__(self, w = 1, h = 2):
        self.w = w
        self.h = h

    def area(self):
        return self.w * self.h

    def perim(self):
        return 2 * (self.w + self.h)
r1 = Rect(5, 9)
print('\nRect w ', r1.w)
print('Rect h ', r1.h)
print('Rect area ', r1.area())
print("Rect perim ", r1.perim())

class OneVar:
    x = 1
    def __init__(self, y):
      self.y = 11
      
    def add(self, a):
        x = self.x + a
        print('in add() x = ', x)
        addx = self.y + 3
        print('in add() addx = ',addx)
add_x = OneVar(6)
print('\nadd_x.x ', add_x.x)
addx = 2
add_x.add(2)
print('add_x.x ', add_x.x)    
print('add_x.addx ', add_x.add(2))
print('create add_x_one_more')
add_x_one_more = OneVar(7)
add_x_one_more.add(3)
print('add_x_one_more ', add_x_one_more.x)

class Fruits:
  def __init__(self, fruitname, price, qty):
    self.price = price
    self.qty = qty
    self.fruitname = fruitname
  def computeTotal(self):
    total =  self.price *  self.qty
    print("Thanks for your purchase")
    print("Your " + self.fruitname +" total is = " , total)
print("Enter the fruit name - >")
fruitname = input()
print("Enter quantity - >")
fruitqty = int( input())
myfruits1 = Fruits(fruitname, 0.5, fruitqty)
myfruits1.computeTotal() 
print("Enter the fruit name - >")
fruitname = input()
print("Enter quantity - >")
fruitqty = int( input())
myfruits2 = Fruits(fruitname, 0.5, fruitqty)
myfruits2.computeTotal()
