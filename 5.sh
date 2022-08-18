echo "enter year"
read a
if [ `expr $a % 400` -eq 0 ]
	then
	echo "leap year"
elif [ `expr $a % 100` -ne 0 -a `expr $a % 4` -eq 0 ]
	then 
	echo "leap year"
	else 
	echo "non leap year"
	fi