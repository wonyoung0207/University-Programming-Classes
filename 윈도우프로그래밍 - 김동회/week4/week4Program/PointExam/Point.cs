using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace PointExam
{
    class Point
    {
        /*멤버변수, 생성자, 접근자ㅡ 수정자, 
         * get,set 메서드, 연산자, 델리게이트,ToString*/
        private int x, y;

        public Point(int x, int y)//생성자 
        {
            this.x = x;
            this.y = y;
        }

        public void SetX(int x)//설정자,C#에서는 첫글자 대문자로 해야함.
        {
            this.x = x;
        }
        public void SetY(int y)//11
        {
            this.y = y;
        }
        public int GetX(int x)
        {
            return x;
        }
        public int GetY(int y)
        {
            return y;
        }

        public void MoveTo(int x, int y)
        {
            this.x = x;
            this.y = y;

        }

        public void MoveBy(int moveX, int moveY)
        {
            this.x = this.x + moveX;
            this.y = this.y + moveY;
        }

        public override string ToString()
        {
            //ToString 메소드는 최상위 객체로부터 상속받는 메소드이기 때문에
            //override 꼭 써줘야 한다. 
            return "X : " + this.x + ", " + " Y : " + this.y;
        }

    }
}
