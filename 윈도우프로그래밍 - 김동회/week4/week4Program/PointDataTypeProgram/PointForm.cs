using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace PointDataTypeProgram
{
    public partial class PointForm : Form
    {
        Point<int> p = null;
        public PointForm()
        {
            InitializeComponent();
        }

        private void btnCreate_Click(object sender, EventArgs e)
        {
            int x, y;

            x = int.Parse(txtX.Text);
            y = int.Parse(txtY.Text);

            p = new Point<int>(x, y);

            txtPrint.Text = p.ToString();
        }

        private void btnChange_Click(object sender, EventArgs e)
        {
            int x, y;

            x = int.Parse(txtX.Text);
            y = int.Parse(txtY.Text);

            p.MoveTo(x, y);
            /*            p.MoveTo<int>(ref x, ref y);*/

            txtPrint.Text = p.ToString();
        }
    }
}
