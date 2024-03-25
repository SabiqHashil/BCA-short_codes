# 12. Write a shell script to count no of line, words and characters of a input file( enter file name 1.sh)

echo "Enter the filename: "
read file

c=$(cat "$file" | wc -c)
w=$(cat "$file" | wc -w)
l=$(grep -c "." "$file")

echo "Number of characters is $c"
echo "Number of words is $w"
echo "Number of lines is $l"
