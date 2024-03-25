# 7. Write a shell script to find reverse of a number

echo "Enter a number to find the reverse of its digits: "
read n

digit=0
reverse=0

while [ $n -gt 0 ]
do
	digit=$(( $n % 10 ))
	reverse=$(( $reverse * 10 + $digit ))
	n=$(( $n / 10 ))
done

echo "The reverse of the digits is " $reverse
