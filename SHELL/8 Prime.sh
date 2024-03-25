# 8. Write a shell script to find prime numbers up to a given number

echo "Enter a limit:"
read limit

echo "Prime numbers up to $limit are:"

for ((num = 2; num <= limit; num++)); do
    is_prime=1

    for ((divisor = 2; divisor < num; divisor++)); do
        if [ $((num % divisor)) -eq 0 ]; then
            is_prime=0 
            break
        fi
    done

    if [ $is_prime -eq 1 ]; then
        echo $num
    fi
done

# file run = ./prime.sh
# permission = sudo chmod +x prime.sh