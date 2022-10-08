using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ColorPointProgram
{
    class Colorable3DPoint : Point
    {
        private int z;
        private string color;

        //상위인 point 에서 상속받아 사용할것이기 때문에 
        //base 로 상위에 있는 x,y의 값을 먼저 넘겨준다. 
        //따라서 생성자에서는 부모클래스의 생성자를 먼저 호출 해줘야 한다. 
        public Colorable3DPoint(int x, int y, int z,string color) : base(x,y)
        {
            this.z = z;
            this.color = color;
        }
        public void SetZ(int z)
        {
            this.z = z;
        }
        public void SetColor(string color)
        {
            this.color = color;
        }
        public int GetZ()
        {
            return this.z;
        }
        public string GetColor()
        {
            return this.color;
        }
        public void MoveTo(int x, int y, int z)
        {
            MoveTo(x, y);
            this.z = z;
            /*base.MoveTo(x, y);*///이것도 가능 
        }
        public void MoveBy(int movex, int movey, int movez)
        {
            MoveBy(movex, movey);
            this.z = this.z + movez;
        }
        public override string ToString()
        {
            return base.ToString() + ", z : " + this.z + ", color : " + this.color;

        }

    }
}
