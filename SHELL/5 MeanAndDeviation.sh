# 5. Write a shell script to compute mean and standard deviation of three numbers

echo "Enter three integers with space between"
read a b c

sum=$((a + b + c))

mean=$((sum / 3))

aa=$((($a - $mean) * ($a - $mean)))
bb=$((($b - $mean) * ($b - $mean)))
cc=$((($c - $mean) * ($c - $mean)))

sd=$(echo "sqrt(($aa + $bb + $cc) / 3)" | bc -l)

echo "Sum = $sum"
echo "Mean = $mean"
echo "Standard Deviation = $sd"
