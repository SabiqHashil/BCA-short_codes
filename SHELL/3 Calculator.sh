# 3. Write a shell script to make a menu driven calculator using case

result=0
i="y"

echo "Enter the first number: "
read n1

echo "Enter the second number: "
read n2

while [ $i = "y" ]
do
	echo "1. Addition"
	echo "2. Subtraction"
	echo "3. Multiplication"
	echo "4. Division"
	echo "Enter your choice: "
	read choice;

	case $choice in
		1) result=`expr $n1 + $n2`
			echo "Sum = " $result;;
		2) result=`expr $n1 - $n2`
			echo "Subtraction = " $result;;
		3) result=`expr $n1 \* $n2`
			echo "Multiplication = " $result;;
		4) result=`expr $n1 / $n2`
			echo "Division = " $result;;
		*) echo "Invalid choice.";;
	esac
	
	echo "Do you want to continue? y or n"
	read i

	if [ $i != "y" ]
	then
		exit
	fi
done
