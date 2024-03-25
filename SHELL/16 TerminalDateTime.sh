# 16. Write a shell script to display current date and time, number of users, terminal name, login date and time

clear
echo "Current date and Time: $(date)"
echo "Terminal name: $(tty)"
echo "Users: $(users)"
echo "Login date time: $(w)"
