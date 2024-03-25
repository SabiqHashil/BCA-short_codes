# 6. Write a shell script to find sum of all digits from a given number

echo "Enter a number to find the sum of its digits: "
read n

digit=0
sum=0

while [ $n -gt 0 ]
do
	digit=$(( $n % 10 ))
	sum=$(( $sum + $digit ))
	n=$(( $n / 10 ))
done

echo "The sum of the digit is " $sum
