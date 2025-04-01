# Written by Calvin Mac Phillips
point_a = [5.5, 10.2]
point_b = [-8.0, 4.6]

def euclidean(point_a,point_b):
    x = point_a[0] - point_a[1]
    x = x**2
    y = point_b[0] - point_b[1]
    y = y**2
    return (x + y)**0.5

print(euclidean(point_a,point_b))
