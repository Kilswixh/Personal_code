# Written by Calvin Mac Phillips
point_a = [5.5, 10.2]
point_b = [-8.0, 4.6]

def Manhattan_distance(point_a,point_b):
    x = abs(point_a[0] - point_a[1])
    y = abs(point_b[0] - point_b[1])
    return x + y

print(Manhattan_distance(point_a,point_b))
