def simpleInterest():
    print("SIMPLE INTEREST");
    principal = float(input("Enter principal amount: "));
    rate = float(input("Enter rate of interest charged per year(as a decimal): "));
    time = float(input("Enter how long the money is borrowed or invested for in years: "));
    interest = principal * rate * time;
    print(f"Interest: {interest}");
def netWorth():
    print("NET WORTH");
    assets = float(input("Enter assets: "));
    debt = float(input("Enter debt: "));
    net_worth = assets - debt;
    print(f"Net Worth: {net_worth}");
def compoundInterest():
    print("COMPOUND INTEREST");
    principal = int(input("Enter principal amount: "));
    rate = float(input("Enter rate of interest charged per year(as a decimal): "));
    num = float(input("Enter the number of times the interest is compounded in years: "));
    time = float(input("Enter how long the money is borrowed or invested for in years: "));
    amount = principal * (1 + rate / num) * num * time;
    print(f"Compound Interest amount: {amount}");
def priceToEarningsRatio():
    print("PRICE TO EARNINGS RATIO");
    price_per_share = float(input("Enter the price per share: "));
    earnings_per_share = float(input("Enter the earnings per share: "));
    price_to_earnings_ratio = price_per_share / earnings_per_share;
    print(f"Price to Earnings ratio: {price_to_earnings_ratio}");
def breakEvenPoint():
    print("BREAK-EVEN POINT");
    fixed_expenses = float(input("Enter the fixed expenses: "));
    gross_profit_margin = float(input("Enter the gross profit margin(in percentage): "));
    break_even_point = fixed_expenses / gross_profit_margin;
    print(f"Break-Even Point: {break_even_point}");
def netIncome():
    print("NET INCOME");
    revenue = float(input("Enter revenue: "));
    expenses = float(input("Enter expenses: "));
    net_income = revenue - expenses;
    print(f"Net Income: {net_income}");
def variationOfInvestment():
    print("VARIATION OF INVESTMENT");
    current_price = float(input("Enter the current price: "));
    purchase_price = float(input("Enter the purchase price: "));
    purchase_price_variation = (current_price - purchase_price) / purchase_price;
    print(f"Purchase Price Variation: {purchase_price_variation}");
def liquidityRatio():
    print("LIQUIDITY RATIO");
    monetary_assets = float(input("Enter monetary assets in dollars: "));
    monthly_expenses = float(input("Enter monthly expenses in dollars: "));
    basic_liquidity_ratio = monetary_assets / monthly_expenses;
    print(f"Basic Liquidity Ratio: {basic_liquidity_ratio}");
def triangle():
    print("TRIANGLE");
    base = float(input("Enter base: "));
    height = float(input("Enter height: "));
    area = 0.5 * base * height;
    print(f"Area: {area}");
def rectangle():
    print("RECTANGLE")
    length = float(input("Enter length: "));
    width = float(input("Enter width: "));
    perimeter = 2 * (length + width);
    area = length * width;
    print(f"Perimeter: {perimeter}");
    print(f"Area: {area}");
def parallelogram():
    print("PARALLELOGRAM");
    side_a = float(input("Enter side a: "));
    side_b = float(input("Enter side b: "));
    base = float(input("Enter base: "));
    height = float(input("Enter height: "));
    perimeter = 2 * (side_a + side_b);
    area = base * height;
    print(f"Perimeter: {perimeter}");
    print(f"Area: {area}");
def trapezium():
    print("TRAPEZIUM");
    side_a = float(input("Enter side a: "));
    side_b = float(input("Enter side b: "));
    height = float(input("Enter height: "));
    area = 0.5 * (side_a + side_b) * height;
    print(f"Area: {area}");
def circle():
    print("CIRCLE");
    PI = 3.14159265;
    radius = float(input("Enter radius: "));
    circumference = 2 * PI * radius;
    area = PI * radius ** 2;
    diameter = 2 * radius;
    print(f"Circumference: {circumference}");
    print(f"Area: {area}");
    print(f"Diameter: {diameter}");
def square():
    print("SQUARE");
    side = float(input("Enter side: "));
    perimeter = side * 4;
    print(f"Perimeter: {perimeter}");
def cube():
    print("CUBE");
    side = float(input("Enter side: "));
    surface_area = 6 * side ** 2;
    volume = side ** 3;
    print(f"Surface Area: {surface_area}");
    print(f"Volume: {volume}");
def cuboid():
    print("CUBOID");
    length = float(input("Enter length: "));
    base = float(input("Enter base: "));
    height = float(input("Enter height: "));
    surface_area = 2 * (length * base + base * height + length * height);
    volume = length * base * height;
    print(f"Surface Area: {surface_area}");
    print(f"Volume: {volume}");
def cylinder():
    print("CYLINDER");
    PI = 3.14159265;
    radius = float(input("Enter radius: "));
    height = float(input("Enter height: "));
    surface_area = 2 * PI * radius * height + 2 * PI * radius ** 2;
    curved_surface_area = 2 * PI * radius * height;
    volume = PI * radius ** 2 * height;
    base_area = PI * radius ** 2;
    print(f"Surface Area: {surface_area}");
    print(f"Curved Surface Area: {curved_surface_area}");
    print(f"Volume: {volume}");
    print(f"Base Area: {base_area}");
def cone():
    print("CONE");
    PI = 3.14159265;
    radius = float(input("Enter radius: "));
    height = float(input("Enter height: "));
    surface_area = PI * radius * (radius + (height**2 + radius**2)**0.5);
    curved_surface_area = PI * radius * ((height**2 + radius**2)**0.5);
    volume = (1/3) * PI * radius ** 2 * height;
    print(f"Surface Area: {surface_area}");
    print(f"Curved Surface Area: {curved_surface_area}");
    print(f"Volume: {volume}");
def sphere():
    print("SPHERE");
    PI = 3.14159265;
    radius = float(input("Enter radius: "));
    surface_area = 4 * PI * radius ** 2;
    volume = (4 / 3) * PI * radius ** 3;
    print(f"Surface Area: {surface_area}");
    print(f"Volume: {volume}");
def main():
    simpleInterest();
    netWorth();
    compoundInterest();
    priceToEarningsRatio();
    breakEvenPoint();
    netIncome();
    variationOfInvestment();
    liquidityRatio();
    triangle();
    rectangle();
    parallelogram();
    trapezium();
    circle();
    square();
    cube();
    cuboid();
    cylinder();
    cone();
    sphere();
if __name__ == '__main__':
    main();
