import React from 'react';
import { motion } from 'motion/react';
import { Clock, User, Dog } from 'lucide-react';
import { Card } from '../ui/card';
import { Button } from '../ui/button';

interface VetDashboardProps {
  onStartAppointment: (appointment: any) => void;
}

const mockAppointments = [
  { id: 1, time: '08:00', animal: 'Rex', owner: 'João Silva', species: 'Cão', reason: 'Consulta de rotina' },
  { id: 2, time: '09:00', animal: 'Mimi', owner: 'Maria Santos', species: 'Gato', reason: 'Vacinação' },
  { id: 3, time: '10:30', animal: 'Bob', owner: 'Pedro Oliveira', species: 'Cão', reason: 'Exame de sangue' },
  { id: 4, time: '11:00', animal: 'Luna', owner: 'Ana Costa', species: 'Gato', reason: 'Check-up' },
  { id: 5, time: '14:00', animal: 'Thor', owner: 'Carlos Lima', species: 'Cão', reason: 'Cirurgia menor' },
  { id: 6, time: '15:30', animal: 'Mel', owner: 'Juliana Alves', species: 'Gato', reason: 'Consulta dermatológica' },
];

export default function VetDashboard({ onStartAppointment }: VetDashboardProps) {
  return (
    <div className="max-w-7xl mx-auto px-4 sm:px-6 lg:px-8 py-8">
      <motion.div
        initial={{ opacity: 0, y: 20 }}
        animate={{ opacity: 1, y: 0 }}
        transition={{ duration: 0.5 }}
      >
        <h1 className="text-3xl text-[#14213D] mb-2">Consultas do Dia</h1>
        <p className="text-gray-600 mb-2">Bem-vindo, Dr. João Santos!</p>
        <div className="flex items-center gap-2 text-[#FCA311] mb-8">
          <Clock size={20} strokeWidth={1.5} />
          <p>Total de atendimentos hoje: <span>{mockAppointments.length}</span></p>
        </div>

        {/* Timeline */}
        <div className="space-y-4">
          {mockAppointments.map((appointment, index) => (
            <motion.div
              key={appointment.id}
              initial={{ opacity: 0, x: -20 }}
              animate={{ opacity: 1, x: 0 }}
              transition={{ duration: 0.5, delay: index * 0.1 }}
            >
              <Card className="p-6 hover:shadow-lg transition-all">
                <div className="flex flex-col sm:flex-row sm:items-center justify-between gap-4">
                  <div className="flex items-start gap-4">
                    <div className="flex-shrink-0">
                      <div className="w-16 h-16 rounded-xl bg-gradient-to-br from-[#FCA311] to-orange-600 flex items-center justify-center">
                        <span className="text-white">{appointment.time}</span>
                      </div>
                    </div>
                    <div className="flex-1">
                      <div className="flex items-center gap-2 mb-1">
                        <Dog size={18} strokeWidth={1.5} className="text-[#14213D]" />
                        <h3 className="text-[#14213D]">{appointment.animal}</h3>
                        <span className="text-sm text-gray-500">({appointment.species})</span>
                      </div>
                      <div className="flex items-center gap-2 text-sm text-gray-600 mb-2">
                        <User size={14} strokeWidth={1.5} />
                        <span>{appointment.owner}</span>
                      </div>
                      <p className="text-sm text-gray-600">{appointment.reason}</p>
                    </div>
                  </div>
                  <Button
                    onClick={() => onStartAppointment(appointment)}
                    className="bg-[#14213D] hover:bg-[#1a2a4d] text-white whitespace-nowrap"
                  >
                    Iniciar Atendimento
                  </Button>
                </div>
              </Card>
            </motion.div>
          ))}
        </div>

        {mockAppointments.length === 0 && (
          <Card className="p-12 text-center">
            <p className="text-gray-500">Nenhuma consulta agendada para hoje.</p>
          </Card>
        )}
      </motion.div>
    </div>
  );
}
