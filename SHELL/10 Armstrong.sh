# 10. Write a shell script to check whether a given number is Armstrong or not

echo "Enter a number to check whether it is an armstrong number: "
read n

sum=0
remainder=0
temp=$n

while [ $temp -gt 0 ]
do
	remainder=$(( $temp % 10 ))
	sum=$(( $sum + remainder * remainder * remainder ))
	temp=$(( $temp / 10 ))
done

if [ $sum -eq $n ]
then
	echo "$n is an armstrong number."
else
	echo "$n is not an armstrong number."
fi

