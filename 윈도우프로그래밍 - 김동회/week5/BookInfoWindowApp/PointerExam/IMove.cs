using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace PointerExam
{
    interface IMove
    {
        //인터페이스는 기본이 pulbic 이기때문에 public 안써줘야 한다. 
        void MoveTo(int x, int y);//x y 좌표를 지정한 x,y좌표로 이동
        void MoveBy(int offX, int offY);//x,y좌표를 지정한 offx.offy만큼 이동

    }
}
