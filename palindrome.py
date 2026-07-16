#PALINDROME CODE 
def palindrome(n):
  original=n
  reverse=0
  digit=n%10
  reverse=reverse*10+digit
  n=n//10
  if original==reverse:
    return "PALINDROME"
  else:
    return "NOT A PALINDROME"
n=int(input("Enter a Value"))
result=palindrome(n)
print(result)
   
