using System;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace navidadSevilla.dto
{
    public class Logica
    {
        public ObservableCollection<Cita> listaCitas { get; set; }
        public Logica() {
            listaCitas = new ObservableCollection<Cita>();
            listaCitas.Add(new Cita("Rafael", "Blanco", "Si", DateTime.Now,"Mañana", "Sevillalandia", "1"));
        }
        public void agregarCita(Cita cita)
        {
            listaCitas.Add(cita);
        }
        public void eliminarCita(int index) { 
            listaCitas.RemoveAt(index);
        }

        public void editarCita (int index, Cita cita) {
            listaCitas[index] = cita;
        }
    }
}
