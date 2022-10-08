using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace PointerExam
{
    //델리게이트 생성
    public delegate void MyDelegate(int x, int y);

    class Point : IMove//인터페이스의 추상메소드를 반드시 구현해야 한다. 
    {
        private int x,y;

        public Point(int x, int y)//생성자
        {
            this.x = x;
            this.y = y;

        }
        //맴버변수에 대한 접근 - 프로퍼티로 함
        //프로퍼티는 get과 set을 가지므로 리턴값을 get에다가 맞춰준다.
        //또한 프로퍼티의 이름은 맴버변수의 이름과 동일하게 해준다.(대문자)
        public int X//x에 대한 프로퍼티
        {
            get// int v = p.X -> get이 호출
            {
                return x;
            }
            set// p.x = 10 -> set이 호출 
            {
                this.x = value;
            }
        }
        public int Y//x에 대한 프로퍼티
        {
            get// int v = p.Y -> get이 호출
            {
                return y;
            }
            set// p.y = 10 -> set이 호출 
            {
                this.y = value;
            }
        }

        public override string ToString()
        {
            return "X : " + x + ", Y : " + y;
        }
        public void MoveTo(int x, int y)
        {
            this.x = x;
            this.y = y;
        }
        public void MoveBy(int offX,int offY)
        {
            this.x = this.x + offX;
            this.y = this.y + offY;
        }

        //내 객체의 좌표와 매개변수로 온 객체의 좌표를 더해주는 메소드
        public Point Add(Point pOther)
        {
            int x, y;
            x = this.x + pOther.X;//pOther의 프로퍼티인 X 프로퍼티로 접근
            y = this.x + pOther.Y;//pOther의 프로퍼티인 X 프로퍼티로 접근

            Point pnew = new Point(x, y);
            return pnew;
        }

        //operator 를 사용해서 연산자를 재정의(중복)해준다.
        public static Point operator+ (Point p1,Point p2)
        {
            int x, y;
            x = p1.X + p2.X;//각 객체의 프로퍼티에 접근해서 더해준다.
            y = p1.Y + p2.Y;
            Point pnew = new Point(x, y);

            return pnew;

        }
    }
}
