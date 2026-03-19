import React from 'react';
import { motion } from 'motion/react';
import { Calendar, UserPlus, Stethoscope, History } from 'lucide-react';
import { Card } from '../ui/card';

interface SecretaryDashboardProps {
  onNavigate: (page: string) => void;
}

const dashboardCards = [
  {
    id: 'scheduling',
    title: 'Consultas de hoje',
    description: 'Visualize e gerencie os agendamentos',
    icon: Calendar,
    color: 'from-blue-500 to-blue-600',
  },
  {
    id: 'registrations',
    title: 'Cadastrar novo cliente',
    description: 'Adicione clientes, animais e mais',
    icon: UserPlus,
    color: 'from-green-500 to-green-600',
  },
  {
    id: 'scheduling',
    title: 'Agendar consulta',
    description: 'Marque uma nova consulta',
    icon: Stethoscope,
    color: 'from-[#FCA311] to-orange-600',
  },
  {
    id: 'history',
    title: 'Ver histórico',
    description: 'Consulte atendimentos anteriores',
    icon: History,
    color: 'from-purple-500 to-purple-600',
  },
];

export default function SecretaryDashboard({ onNavigate }: SecretaryDashboardProps) {
  return (
    <div className="max-w-7xl mx-auto px-4 sm:px-6 lg:px-8 py-8">
      <motion.div
        initial={{ opacity: 0, y: 20 }}
        animate={{ opacity: 1, y: 0 }}
        transition={{ duration: 0.5 }}
      >
        <h1 className="text-3xl text-[#14213D] mb-2">Painel da Secretária</h1>
        <p className="text-gray-600 mb-8">Bem-vinda! Escolha uma opção abaixo para começar.</p>

        {/* Search bar */}
        <div className="mb-8">
          <input
            type="search"
            placeholder="Buscar clientes, animais ou médicos..."
            className="w-full max-w-2xl px-4 py-3 rounded-xl border border-gray-300 focus:outline-none focus:ring-2 focus:ring-[#FCA311] shadow-sm"
          />
        </div>

        {/* Dashboard cards */}
        <div className="grid grid-cols-1 md:grid-cols-2 lg:grid-cols-4 gap-6">
          {dashboardCards.map((card, index) => {
            const Icon = card.icon;
            return (
              <motion.div
                key={card.id + index}
                initial={{ opacity: 0, y: 20 }}
                animate={{ opacity: 1, y: 0 }}
                transition={{ duration: 0.5, delay: index * 0.1 }}
              >
                <Card
                  className="p-6 cursor-pointer transition-all hover:shadow-xl hover:-translate-y-1 border-0"
                  onClick={() => onNavigate(card.id)}
                >
                  <div className={`w-12 h-12 rounded-xl bg-gradient-to-br ${card.color} flex items-center justify-center mb-4`}>
                    <Icon size={24} strokeWidth={1.5} className="text-white" />
                  </div>
                  <h3 className="text-[#14213D] mb-2">{card.title}</h3>
                  <p className="text-sm text-gray-600">{card.description}</p>
                </Card>
              </motion.div>
            );
          })}
        </div>

        {/* Quick stats */}
        <div className="mt-12 grid grid-cols-1 md:grid-cols-3 gap-6">
          <Card className="p-6 border-l-4 border-l-blue-500">
            <p className="text-sm text-gray-600 mb-1">Consultas hoje</p>
            <p className="text-3xl text-[#14213D]">12</p>
          </Card>
          <Card className="p-6 border-l-4 border-l-green-500">
            <p className="text-sm text-gray-600 mb-1">Novos clientes (mês)</p>
            <p className="text-3xl text-[#14213D]">28</p>
          </Card>
          <Card className="p-6 border-l-4 border-l-[#FCA311]">
            <p className="text-sm text-gray-600 mb-1">Consultas pendentes</p>
            <p className="text-3xl text-[#14213D]">5</p>
          </Card>
        </div>
      </motion.div>
    </div>
  );
}
