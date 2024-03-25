# 7. Write a shell script to find reverse of a number

echo "Enter a number to find the reverse of its digits: "
read n

digit=0
reverse=0

<<<<<<< HEAD
while [ $n -gt 0 ]
do
	digit=$(( $n % 10 ))
	reverse=$(( $reverse * 10 + $digit ))
	n=$(( $n / 10 ))
done

echo "The reverse of the digits is " $reverse
=======
echo "Enter a number: "
read num

reverse=0

while [ $num -gt 0 ]
do
    remainder=$(( $num % 10 ))
    reverse=$(( $reverse * 10 + $remainder ))
    num=$(( $num / 10 ))
done

echo "Reverse of the number is: $reverse"
>>>>>>> 16de1c1091d7eedfbbbcadc744d5f520d3318d5a
