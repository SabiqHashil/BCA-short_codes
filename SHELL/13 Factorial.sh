# 13. Write a shell script find the factorial of a given number

echo "Enter a number to find the factorial: "
read n
factorial=1
for (( i=1; i<=n; i++ ))
do
	factorial=$(( $factorial * $i ))
done
echo "Factorial of $n is" $factorial

