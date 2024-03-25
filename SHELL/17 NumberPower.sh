# 17. Write a shell script to find the value of one number raised to the power of another. Two numbers are entered through the keyboard.

echo "Enter two numbers: "
read a b

echo $a ^ $b | bc
