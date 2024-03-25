# 14. An employee Basic Pay is input through keyboard where DA is 40% of basic pay and HRA is 20% of basic pay. Write a shell script to calculate gross salary, Gross Salary =Basic Pay + DA + HRA

echo "Enter basic salary: "
read basic

gross=$(( basic + ((basic / 100) * 40) + ((basic / 100) * 20) ))

echo "The gross salary: " $gross
