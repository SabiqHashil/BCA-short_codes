# 4. Write a shell script to find the greatest of three numbers( enter three number in one line by space)

echo "Enter three numbers to check which is the greates: "
read a b c

if [ $a -gt $b -a $a -gt $c ]
then
	echo "$a is the greates."
elif [ $b -gt $c ]
then
	echo "$b is the greatest."
else
	echo "$c is the greates."
fi
