# 2. Write a shell script to find given number is even or odd

echo "Enter the number to check whether it is even or odd: "
read n;
rem=$(( $n % 2 ));
if [ $rem -eq 0 ]
then
	echo "$n is an even number."
else
	echo "$n is an odd number."
fi
