using navidadSevilla;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows;
using System.Windows.Controls;
using System.Windows.Data;
using System.Windows.Documents;
using System.Windows.Input;
using System.Windows.Media;
using System.Windows.Media.Imaging;
using System.Windows.Shapes;

namespace navidad_Sevilla
{
    /// <summary>
    /// Lógica de interacción para Window1.xaml
    /// </summary>
    public partial class SevillaLandia : Window
    {
        public SevillaLandia()
        {
            InitializeComponent();
        }
        public void reservasSevillalandia(object sender, RoutedEventArgs e)
        {
            new Formulario_Citas("Sevillalandia").Show();
        }

        public void goBack(object sender, RoutedEventArgs e)
        {
            this.Close();
        }
    }
}
