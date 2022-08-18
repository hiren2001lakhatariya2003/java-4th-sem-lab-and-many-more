echo "A = "
read a
echo "B = "
read b
echo "C = "
read c

if [ $a -gt $b ]
then
	if [ $a -gt $c ]
	then
		echo "A is largest"
	else
		echo "C is largest"
	fi
elif [ $b -gt $c ]
then
		echo "B is largest"
else
		echo "C is largest"
fi