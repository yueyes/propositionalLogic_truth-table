first_symbol = raw_input("Form :  (p O1 q) O2 r\nPossible choices are: and,or,xor,nand\nPlease enter O1:\n")
second_symbol = raw_input("Please enter O2:\n")
print("p\t|q\t|p "+ first_symbol +" q|r\t|(p "+ first_symbol +" q) "+ second_symbol + " r\n");

for p in range(0,2):
	if p <=1:
		for q in range(0,2):
			if q<=1:
				for r in range(0,2):
					if r<=1:
						pq=0
						pqr=0
						if first_symbol == "and" and p == 1 and q == 1:
							pq=1
						if first_symbol == "or" and (p == 1 or q == 1):
							pq=1
						if first_symbol == "xor" and (p != q):
							pq=1
						if first_symbol == "nand" and not(p * q == 1):
							pq=1
						if second_symbol == "and" and pq == 1 and r == 1:
							pqr=1
						if second_symbol == "or" and (pq == 1 or r == 1):
							pqr=1
						if second_symbol == "xor" and (pq != r):
							pqr=1
						if second_symbol == "nand" and not(pq * r ==1):
							pqr=1

						if len(first_symbol) == 2:
							print("%d\t|%d\t|%-6d|%d\t|%-16d\n" % (p,q,pq,r,pqr))
						if len(first_symbol) == 3:
							print("%d\t|%d\t|%-7d|%d\t|%-16d\n" % (p,q,pq,r,pqr));
						if len(first_symbol) == 4:
							print("%d\t|%d\t|%-8d|%d\t|%-16d\n" % (p,q,pq,r,pqr));
					r+=1
			q+=1
	p+=1