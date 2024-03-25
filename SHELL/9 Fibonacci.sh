# 9. Write a shell script to find n Fibonacci numbers

echo "Enter the limit for Fibonacci number: "
read limit
count=3
n1=0
n2=1

echo $n1
echo $n2

while [ $count -le $limit ]
do
	n3=$(( $n1 + $n2 ))
	n1=$n2
	n2=$n3
	echo $n3
	count=$(( $count + 1 ))
done
