import React, { useState } from 'react';
import { motion } from 'motion/react';
import { ArrowLeft, Search, Calendar, User, Dog } from 'lucide-react';
import { Button } from './ui/button';
import { Card } from './ui/card';
import { Input } from './ui/input';
import { Badge } from './ui/badge';

interface HistoryPageProps {
  onBack: () => void;
}

const mockHistory = [
  {
    id: 1,
    date: '2025-10-30',
    time: '14:00',
    animal: 'Rex',
    owner: 'João Silva',
    vet: 'Dr. João Santos',
    diagnosis: 'Consulta de rotina - Animal saudável',
    status: 'Concluído',
  },
  {
    id: 2,
    date: '2025-10-29',
    time: '10:30',
    animal: 'Mimi',
    owner: 'Maria Santos',
    vet: 'Dra. Maria Silva',
    diagnosis: 'Vacinação antirrábica realizada',
    status: 'Concluído',
  },
  {
    id: 3,
    date: '2025-10-28',
    time: '15:00',
    animal: 'Bob',
    owner: 'Pedro Oliveira',
    vet: 'Dr. João Santos',
    diagnosis: 'Exame de sangue - Resultados normais',
    status: 'Concluído',
  },
  {
    id: 4,
    date: '2025-10-27',
    time: '09:00',
    animal: 'Luna',
    owner: 'Ana Costa',
    vet: 'Dra. Maria Silva',
    diagnosis: 'Check-up geral - Orientações nutricionais fornecidas',
    status: 'Concluído',
  },
];

export default function HistoryPage({ onBack }: HistoryPageProps) {
  const [searchTerm, setSearchTerm] = useState('');

  const filteredHistory = mockHistory.filter(
    (item) =>
      item.animal.toLowerCase().includes(searchTerm.toLowerCase()) ||
      item.owner.toLowerCase().includes(searchTerm.toLowerCase()) ||
      item.vet.toLowerCase().includes(searchTerm.toLowerCase())
  );

  return (
    <div className="max-w-7xl mx-auto px-4 sm:px-6 lg:px-8 py-8">
      <motion.div
        initial={{ opacity: 0, y: 20 }}
        animate={{ opacity: 1, y: 0 }}
        transition={{ duration: 0.5 }}
      >
        <Button
          variant="ghost"
          onClick={onBack}
          className="mb-6"
        >
          <ArrowLeft size={18} strokeWidth={1.5} className="mr-2" />
          Voltar
        </Button>

        <h1 className="text-3xl text-[#14213D] mb-2">Histórico de Consultas</h1>
        <p className="text-gray-600 mb-8">Consulte atendimentos anteriores</p>

        {/* Search bar */}
        <div className="mb-6 relative">
          <Search size={20} strokeWidth={1.5} className="absolute left-3 top-1/2 -translate-y-1/2 text-gray-400" />
          <Input
            type="search"
            placeholder="Buscar por animal, proprietário ou veterinário..."
            value={searchTerm}
            onChange={(e) => setSearchTerm(e.target.value)}
            className="pl-10"
          />
        </div>

        {/* History list */}
        <div className="space-y-4">
          {filteredHistory.map((item, index) => (
            <motion.div
              key={item.id}
              initial={{ opacity: 0, y: 20 }}
              animate={{ opacity: 1, y: 0 }}
              transition={{ duration: 0.5, delay: index * 0.1 }}
            >
              <Card className="p-6 hover:shadow-lg transition-all">
                <div className="flex flex-col md:flex-row md:items-start md:justify-between gap-4">
                  <div className="flex-1">
                    <div className="flex items-center gap-3 mb-3">
                      <div className="flex items-center gap-2 text-gray-600">
                        <Calendar size={16} strokeWidth={1.5} />
                        <span className="text-sm">{new Date(item.date).toLocaleDateString('pt-BR')}</span>
                        <span className="text-sm">às {item.time}</span>
                      </div>
                      <Badge className="bg-green-100 text-green-700">{item.status}</Badge>
                    </div>

                    <div className="space-y-2">
                      <div className="flex items-center gap-2">
                        <Dog size={18} strokeWidth={1.5} className="text-[#FCA311]" />
                        <span className="text-[#14213D]">{item.animal}</span>
                      </div>

                      <div className="flex items-center gap-2 text-sm text-gray-600">
                        <User size={14} strokeWidth={1.5} />
                        <span>Proprietário: {item.owner}</span>
                      </div>

                      <div className="text-sm text-gray-600">
                        <span>Veterinário: {item.vet}</span>
                      </div>

                      <div className="mt-3 p-3 bg-gray-50 rounded-lg">
                        <p className="text-sm text-gray-700">
                          <strong>Diagnóstico:</strong> {item.diagnosis}
                        </p>
                      </div>
                    </div>
                  </div>

                  <Button variant="outline" size="sm">
                    Ver detalhes
                  </Button>
                </div>
              </Card>
            </motion.div>
          ))}

          {filteredHistory.length === 0 && (
            <Card className="p-12 text-center">
              <p className="text-gray-500">Nenhum resultado encontrado</p>
            </Card>
          )}
        </div>
      </motion.div>
    </div>
  );
}
