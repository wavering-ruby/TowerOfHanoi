def TH(n, O, D, A):
    if n > 1:
        TH(n - 1, O, A, D)
        print(f"Move disk {n} from {O} to {D}")
        TH(n - 1, A, D, O)
    else:
        print(f"Move disk 1 from {O} to {D}")

def main():
    n = 3
    O = 'A'
    D = 'C'
    A = 'B'
  
    TH(n, O, D, A)

if __name__ == "__main__":
    main()
