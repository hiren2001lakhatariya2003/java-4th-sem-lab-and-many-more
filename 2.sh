echo "a = "
read a
echo "b = "
read b

if [ $a -gt $b ]
then
	echo $a "is Greater"
else
	echo $b "is Greater"
fi