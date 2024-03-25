# 3. Write a shell script to make a menu driven calculator using case

result=0
i="y"

echo "Enter the first number: "
read n1

echo "Enter the second number: "
read n2

while [ $i = "y" ]
do
<<<<<<< HEAD
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
=======
    echo "1.Addition"
    echo "2.Subtraction"
    echo "3.Multiplication"
    echo "4.Division"
    echo "Enter your choice"
    read ch
    case $ch in
        1)sum=`expr $n1 + $n2`
        echo "Sum ="$sum;;
        2)sub=`expr $n1 - $n2`
        echo "Sub = "$sub;;
        3)mul=`expr $n1 \* $n2`
        echo "Mul = "$mul;;
        4)div=`expr $n1 / $n2`
        echo "Div = "$div;;
        *)echo "Invalid choice";;
    esac
    echo "Do u want to continue ?"
    read i
    if [ $i != "y" ]
    then
        exit
    fi
>>>>>>> 16de1c1091d7eedfbbbcadc744d5f520d3318d5a
done
