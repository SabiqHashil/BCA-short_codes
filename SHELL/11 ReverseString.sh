# 11. Write a shell script to reverse a string and check whether a given string is palindrome or not

echo "Enter a string to check if it's a palindrome: "
read string
echo $string>temp
reverse="$(rev temp)"
if [ $string = $reverse ]
then
	echo "It is palindrome"
else
	echo "It is not a palindrome"
fi
