def solution(n, control):
    w = control.count("w")
    a = control.count("a")
    s = control.count("s")
    d = control.count("d")
    
    return n + w * 1 + s * (-1) + d * 10 + a *(-10)