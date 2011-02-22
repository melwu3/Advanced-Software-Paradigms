SwiftForth i386-Win32 3.2.5 10-Feb-2011
\ Melanie Wu Forth Assignment
: greet ." Hey, big spender!" ;  ok
greet Hey, big spender! ok
: refrain ." Spend a little time with me." ;  ok
refrain Spend a little time with me. ok
: song greet ."  " refrain ;  ok
song Hey, big spender! Spend a little time with me. ok
: greet ." Hey, Fred." ;
greet isn't unique.  ok
song Hey, big spender! Spend a little time with me. ok
\ I think song prints out the original definition because  ok
\ when song was compiled, the pointer pointed to the old  ok
\ definition of greet and since the redefinition of greet  ok
\ song hasn't been compiled to redirect that pointer  ok
variable _greeter  ok
: greet1 ." Hey, big spender!" ;  ok
' greet1 _greeter !  ok
: song _greeter @ execute refrain ;
song isn't unique.  ok
song Hey, big spender!Spend a little time with me. ok
: greet2 ." Stellaaaaaa!" ;  ok
' greet2 _greeter !  ok
song Stellaaaaaa!Spend a little time with me. ok
variable _refrain  ok
: refrain1 ." Testing 1 2 3..." ;  ok
' refrain1 _refrain !  ok
: song _greeter @ execute _refrain @ execute ;
song isn't unique.  ok
song Stellaaaaaa!Testing 1 2 3... ok
: refrain2 ." HELLO!" ;  ok
' refrain2 _refrain !  ok
song Stellaaaaaa!HELLO! ok
: dump begin dup . 0= until ;
DUMP isn't unique.  ok
0 1 2 3 4 5 6 7 8 9 10 99  ok
dump 99 10 9 8 7 6 5 4 3 2 1 0  ok
: interleave >r begin dup . r@ . 0= until r> drop ;  ok
0 1 2 3 4 5 6 7 8 9 10 99  ok
interleave 10 99 9 99 8 99 7 99 6 99 5 99 4 99 3 99 2 99 1 99 0 99  ok
: array   create cells allot ;  ok
10 array myarray  ok
7 myarray 3 cells + !  ok
myarray 8 cells + @  ok
. 0  ok
myarray 3 cells + @  ok
. 7  ok
: array create cells allot does> swap cells + ;
array isn't unique.  ok
10 array myarray
myarray isn't unique.  ok
7 3 myarray !  ok
8 myarray @  ok
. 0  ok
10 3 myarray !  ok
3 myarray @  ok
. 10  ok
: 2array create cells cells allot does> rot cells rot * + ;  ok
10 5 2array grid  ok
7 3 3 grid !  ok
3 3 grid @  ok
. 7  ok
2 8 grid @  ok
. 0  ok
99 2 8 grid !  ok
2 8 grid @  ok
. 99  ok
: exp 1- swap >r r@ swap begin r@ rot * swap 1- dup 0= until drop r> drop ;  ok
variable n
N isn't unique.  ok
: degree n ! ;  ok
: poly n @ 1+
begin swap >r 1- dup 0= until drop
>r r@ n @
begin dup rot rot exp r> r> swap >r * r@ rot 1- dup 1- 0= until drop drop
r> r> * r> n @
begin rot rot + swap 1- dup 0= until drop ;  ok
5 degree 2 1 1 2 1 0 4 poly  ok
. 72  ok
5 degree 2 1 1 -2 1 0 4 poly  ok
. 40  ok
variable x  ok
: a(x) x ! 5 degree x @ 1 1 -2 1 0 4 poly ;  ok
2 a(x)  ok
. 40  ok
3 a(x)  ok
. 283  ok
