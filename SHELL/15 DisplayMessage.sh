# 15. Write a shell script which whenever gets executed displays the message Good Morning/Good afternoon /Good Evening depending on the time it gets executed

hour=`date +%H`
if [ $hour -lt 12 ]
then
	echo "Good Morining"
elif [ $hour -le 16 ]
then
	echo "Good Afternoon"
else [ hour -le 20 ]
	echo "Good Evening"
fi
