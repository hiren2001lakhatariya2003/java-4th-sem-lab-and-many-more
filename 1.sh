echo "a = "
read a
echo "b = "
read b

Add=`expr $a + $b`
sub=`expr $a - $b`
mul=`expr $a \* $b`
div=`expr $a / $b`

echo "Addition = " $Add
echo "Substract = " $sub
echo "Multiplication = " $mul
echo "Division = " $div