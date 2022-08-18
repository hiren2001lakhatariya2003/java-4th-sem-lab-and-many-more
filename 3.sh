echo "number = "
read a

if [ `expr $a % 2` -eq 0 ]
then
	echo "given number is even"
else
	echo "given number is odd"
fi
